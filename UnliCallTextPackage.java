public class UnliCallTextPackage implements UnliCallsTextOffer{
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        return "[" + telcoName + (unliCallText? " does" : " does NOT") +" offer unlimited calls and text]";
    }
}