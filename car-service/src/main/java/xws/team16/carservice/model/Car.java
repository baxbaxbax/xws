package xws.team16.carservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Car {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "kilometrage")
   private double kilometrage;

   @Column(name = "number_of_child_seats")
   private int numberOfChildSeats;

   @Column(name = "has_android")
   private boolean hasAndroid;

   @Column(name = "number_of_grades")
   private int numberOfGrades;

   @OneToMany(mappedBy = "car")
   private Set<Comment> comments;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "mark_id", nullable = false)
   private Mark mark;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "car_class_id", nullable = false)
   private CarClass carClass;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "fuel_id", nullable = false)
   private Fuel fuel;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "model_id", nullable = false)
   private Model model;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "gearbox_id", nullable = false)
   private Gearbox gearbox;

   @OneToMany(mappedBy = "car")
   private Set<Occupied> occupied;

   @OneToMany(mappedBy = "car")
   private Set<Report> report;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "owner_id", nullable = false)
   private User owner;

   @OneToMany(mappedBy = "car")
   private Set<Grade> grades;

   @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
   private Set<MyImage> images;

   @Transient
   private float overallGrade;

   @OneToMany(mappedBy = "car")
   private Set<Ad> ads;

   public Float getAverageGrade(){
      /* Returns null if Car has no grades. */
      int sum = 0;
      for (Grade g : this.grades){
         sum += g.getGrade();
      }

      if (sum == 0) {
         return null;
      } else {
         Float averageGrade = new Float(0);
         averageGrade = (float) sum / grades.size();
         return averageGrade;
      }
   }
}