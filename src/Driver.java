import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: Gifflen
 * Chapter 9 Problem 2
 *  Problem: This program asks you to implement a complete binary tree using an array (or ArrayList).
 *  Write the program so that I can enter an index and it will print out the given left and right child for that node.
 */
public class Driver {

    private static void runTests(int index,BinaryTree test){
        System.out.println("Root Data:" + test.getData(index));
        System.out.println("Depth :"+test.getDepth());
        test.getDataAtIndex(index);
        System.out.println("Index of left branch :" + test.getLeftIndex(index));
        System.out.println("Index of Right branch :" +test.getRightIndex(index));
        System.out.println("Branch Left of root: "+test.getLeftData(index));
        System.out.println("Branch Right of root: "+ test.getRightData(index));
        System.out.println("Is leaf :" + test.isLeaf(index));
        System.out.println("Left Most Data: " + test.getLeftMostData(index));
        System.out.println("Right Most Data: " + test.getRightMostData(index));
    }
    private static void getInput(BinaryTree test){
        String inpString = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
                System.out.println("Input a number to test. Type \"quit\" to exit");
                inpString = in.readLine();

                if(inpString=="quit")break;

              try{
                runTests(Integer.parseInt(inpString), test);
              }catch (NumberFormatException e){
                  System.out.println("User input is not an Integer: " + inpString);
              }

            }catch (IOException e){
                System.out.println("Oh Mah Gawd. The Humanity. What have you DONE?!?");
            }


        }


    }

    private static void getInput(Integer integer, BinaryTree test) {
    }


    public  static void main(String[] args){
        BinaryTree<Integer> btint = new BinaryTree<Integer>();
        btint.addNode(1);
        btint.addNode(2);
        btint.addNode(3);
        btint.addNode(4);
        btint.addNode(5);
        btint.addNode(6);
        btint.addNode(7);
        btint.addNode(8);
        //btint.addNode(9);
        //btint.addNode(10);
        //btint.addNode(11);

        getInput(btint);


    }
}
