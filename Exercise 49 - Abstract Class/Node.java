public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        this.rightLink = listItem;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        this.leftLink = listItem;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        return Integer.valueOf(this.value.toString()) - Integer.valueOf(listItem.value.toString());
    }
}
