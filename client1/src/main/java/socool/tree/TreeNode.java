package socool.tree;

/**
 * Created by administrator_cheng on 2019/4/1.
 */
public class TreeNode {
    private String name;
    private int age;
    private TreeNode leftTree;
    private TreeNode rightTree;

    public TreeNode(String name, int age, TreeNode leftTree, TreeNode rightTree) {
        this.name = name;
        this.age = age;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TreeNode getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(TreeNode leftTree) {
        this.leftTree = leftTree;
    }

    public TreeNode getRightTree() {
        return rightTree;
    }

    public void setRightTree(TreeNode rightTree) {
        this.rightTree = rightTree;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", leftTree=" + leftTree +
                ", rightTree=" + rightTree +
                '}';
    }
}
