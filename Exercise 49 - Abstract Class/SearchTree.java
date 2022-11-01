public class SearchTree implements NodeList{
    ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
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
