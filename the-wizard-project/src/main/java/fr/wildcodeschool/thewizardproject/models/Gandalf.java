package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

    private Outfit myOutfit;

    @Override
    public String giveAdvice() {
        return "Le Mordor Gandalf, c'est à gauche ou à droite ?";
    }

    public Gandalf(Outfit theOutfit) {
        myOutfit = theOutfit;
    }

    @Override
    public String changeDress() {
        return myOutfit.describeDress() + "white too";
    }

    public void setOutfit(Outfit theOutfit) {
        myOutfit = theOutfit;
    }
    
}