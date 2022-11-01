public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }


    public boolean addItem(ListItem listItem){
        if(this.root == null){
            this.root = listItem;
            return true;
        }
        if (listItem.compareTo(root) == 0){
            System.out.println("Item already on list");
            return false;
        }
        else if (listItem.compareTo(root) > 0){
            listItem = listItem.rightLink;
        }
        else if (listItem.compareTo(root) < 0){
            listItem = listItem.leftLink;
        }
        else{

        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("The list is empty");
        }
        else{
            //print

        }
    }
}
