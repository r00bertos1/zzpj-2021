package pl.java.zzpj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String model;

    public String carInfo(){
        return "The model of car is " + model;
    }
}
