package simulado_q1;

import java.time.LocalDate;

public class VerifiedUser extends User{
    
    private LocalDate verificationData;

    public VerifiedUser(String nome, String tweetrId, LocalDate verificationData){
        
        super(nome, tweetrId);
        this.verificationData = verificationData;
    }

    public LocalDate getVerificationData() {
        return verificationData;
    }
}
