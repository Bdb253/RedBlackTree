package p8_Package;

public class RBT_Tester
{
   public static void main(String[] args)
   {
      RBTreeClass RBTree = new RBTreeClass();
      
      RBTree.insert('f');
      RBTree.insert('c');
      RBTree.insert('r');
      RBTree.insert('d');
      RBTree.insert('q');
      RBTree.insert('d');
      RBTree.insert('z');
      
      
      //RBTree.insert('d');
      //RBTree.insert('a');
      //RBTree.setTreeDisplayCharacter(191);
      //RBTree.insert('b');
      
      //System.out.println(RBTree.search('c'));
      
      RBTree.displayTreeStructure();
   }
}
