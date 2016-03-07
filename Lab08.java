import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;


public class Lab08{
    public static void main(String[] args){
	//martins variables
	int martinRut = 0;
	Boolean martinNewSize = true;
	int martinCounter = 0;

	//pangloss's variables
	int pangRut = 0;
	Boolean pangNewSize = true;
	int pangCounter = 0; 
	
	Random rand = new Random();
	ArrayList<String> martin = new ArrayList<String>();
	ArrayList<String> pang = new ArrayList<String>();
	for (int i = 0; i < 5; i++){
	    martin.add("***");
	    pang.add("***");
	}//end Array
		
	for (int j = 0; j < 40; j++){
	    int numRut = rand.nextInt(5);
	    int season = j + 1;
	    System.out.println("Season: " + season + ", " + numRut + " rutabaga(s)");

	    //Martin
	    int k = 0;
	    martinNewSize = false;
	    for (k = 0; k < numRut; k++){
		if (martinRut >= martin.size()){
		    martin.add("***");
		    martin.add("***");
		    martinNewSize = true;
		    martinCounter++;
		}//end adding to array
		int index = martinRut;
		if (numRut == 1){
		    martin.set(index, "1");
		}//end num bagas = 1
		if (numRut == 2){
		    martin.set(index, "2");
		}//end num bagas = 2
		if (numRut == 3){
		    martin.set(index, "3");
		}//end num bagas = 3
		if (numRut == 4){
		    martin.set(index, "4");
		}//end num bagas = 4
		martinRut++;

	    }//adding the bagas

	    if (martinNewSize && numRut != 0){
		if (numRut != 4){
		System.out.println("Resized Martin's Garden to " + martin.size() + "!");
		}//end if not 4
		else{
		    int adjust = martin.size() - 2;
		    System.out.println("Resized Martin's Garden to " + adjust + "!");
		    System.out.println("Resized Martin's Garden to " + martin.size() + "!");
		}//4
	    }//end resized martin's garden


	    //Pangloss
	    pangNewSize = false;
	    for (k = 0; k < numRut; k++){
		if (pangRut >= pang.size()){
		    int size = pang.size();
		    for (int s = 0; s < size; s++){
			pang.add("***");
		    }//resizing
		    pangNewSize = true;
		    pangCounter++;
		}//resized
		int index = pangRut;
		if (numRut == 1){
		    pang.set(index, "1");
		}//end num bagas = 1
		if (numRut == 2){
		    pang.set(index, "2");
		}//end num bagas = 2
		if (numRut == 3){
		    pang.set(index, "3");
		}//end num bagas = 3
		if (numRut == 4){
		    pang.set(index, "4");
		}//end num bagas = 4
		pangRut++;
	
	    }//adding bagas
	    if (pangNewSize && numRut != 0){
		System.out.println("Resized Pangloss's Garden to " + pang.size() + "!");
	    }//end resized pang's garden

	    
	}//end for loop
	System.out.print("[ ");
	for (String s : martin){
	    System.out.print(s + "," );
	}//end printing martin array
	System.out.print("]");
	System.out.println();
	System.out.println("Martin Garden Size: " + martin.size() + ", Resized " + martinCounter + " times");

	System.out.print("[ ");
	for (String s : pang){
	    System.out.print(s + ",");
	}//end printing the pang array
	System.out.print("]");
	System.out.println();
	System.out.println("Pangloss Garden Size: " + pang.size() + ", Resized " + pangCounter + " times");
    }

}
    
