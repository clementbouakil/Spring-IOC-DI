package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {

    private Outfit myOutfit;

    @Override
    public String giveAdvice() {
        return "N’aie pas pitié des morts Harry, aie pitié des vivants et en particulier de tous ceux qui vivent sans amour.";
    }

    public Dumbledore(Outfit theOutfit) {
        myOutfit = theOutfit;
    }

    @Override
    public String changeDress() {
        return myOutfit.describeDress() + "white";
    }

    public void setOutfit(Outfit theOutfit) {
        myOutfit = theOutfit;
    }
    
}