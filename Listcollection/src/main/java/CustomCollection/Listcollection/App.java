package CustomCollection.Listcollection;
import java.util.Scanner;
public class App 
   {
   public static void main( String[] args )
   {
    System.out.println( "!--------CustomList--------!" );
    Scanner sc=new Scanner(System.in);
    custom<String> list=new custom<String>();
    //Adding branches
    list.add("Quantum Mechanics");
    list.add("Classical Mechanics");
    list.add("Electromagnetism");
    list.add("Kinetics");
    list.add("Dynamics");
    list.add("Cosmology");
    list.add("Optics");
    list.add("Condensed Matter Physics");
    list.add("Nuclear Physics");
    list.add("Gravitation");  	  	 
    System.out.println("Current List :");
    System.out.println(list);
    int choose=1;
    while(choose == 1) {
    	 System.out.println("\nList Operations");
    	 System.out.println("\n1.Add Branch\n2.Fetch Branch\n3.Remove Branch\n4.List Of Branches");
    	 System.out.println("Enter choice");
    	 int choice = sc.nextInt();
         switch(choice) {
    	 	case 1:
    	 		System.out.println("Enter a branch in physics:");
    	  		String s=sc.next();
    	  		list.add(s);
    	  		System.out.println(list);
    	  		break;
    	    case 2:
    			System.out.println("Enter the index to get the branch:");
    			int ind=sc.nextInt();
    			System.out.println("Branch ---->"+list.get(ind));
    			break;
    	    case 3:
    	  		System.out.println("Enter index of the branch to be removed:");
    	  		int index=sc.nextInt();
    	  		System.out.println("The removed branch is "+list.remove(index));
    	  		System.out.println("the list after removing branch"+list);
    	  		break;
    	    case 4:
    	  		System.out.println(list);
    	  		break;
    	    default:
    	  		System.out.println("Please select a valid ones...\n");
    	  		break;
    	  		}
         System.out.println("\nDo you want to continue:\n1.Yes\n2.No\n");
         int op = sc.nextInt();
         choose =op;
         }
     sc.close();
     }
   }


