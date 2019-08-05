public class CompareToChallenge
{
    public static void main(String[] args)
    {

        System.out.print("Comparing \"cat\" with \"dog\" produces ");
        int i = "cat".compareTo("dog");
        System.out.println(i);

        System.out.print("Comparing \"dog\" with \"baby\" produces ");
        System.out.println("dog".compareTo("baby"));


        System.out.print("Comparing \"potato\" with \"tomato\" produces ");
        System.out.println("potato".compareTo("tomato"));


        System.out.print("Comparing \"apples\" with \"apples\" produces ");
        System.out.println("apples".compareTo("apples"));

        System.out.print("Comparing \"sausage\" with \"SAUSAGE\" produces ");
        System.out.println("sausage".compareTo("SAUSAGE"));
        
        System.out.print("Comparing \"CAKE\" with \"cake\" produces ");
        System.out.println("CAKE".compareTo("cake"));
        
        System.out.print("Comparing \"toast\" with \"peanut butter\" produces ");
        System.out.println("toast".compareTo("peanut butter"));
        
        System.out.print("Comparing \"dachshund\" with \"sausage dog\" produces ");
        System.out.println("dachshund".compareTo("sausage dog"));
        
        System.out.print("Comparing \"pekingese\" with \"cocker spaniel\" produces ");
        System.out.println("pekingese".compareTo("cocker spaniel"));

        System.out.print("Comparing \"gin\" with \"gin\" produces ");
        System.out.println("gin".compareTo("gin"));

        System.out.print("Comparing \"prosecco\" with \"champagne\" produces ");
        System.out.println("prosecco".compareTo("champagne"));

        System.out.print("Comparing \"wine\" with \"vodka\" produces ");
        System.out.println("vodka".compareTo("wine"));
    }
}