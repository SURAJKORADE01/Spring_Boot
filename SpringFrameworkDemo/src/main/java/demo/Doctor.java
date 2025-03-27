package demo;

import org.springframework.stereotype.Component;

// create the beans of this class
@Component
public class Doctor implements Staff
{
//    private String qualification;
//
//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }
//
//    public String getQualification() {
//        return qualification;
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }

//    The above code is used for xml based configuration

    public void assist()
    {
        System.out.println("Doctor is assisting...");
    }
}
