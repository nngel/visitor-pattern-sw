public class TelcoAllowance implements UsagePromo{
    public String showAllowance(String telcoName, int dataAllowance, double money){
        return "["+ telcoName + " offers "+dataAllowance+" GB for ₱"+money+"]";
    }
}