package socool.tree;

import java.util.Map;

/**
 * Created by administrator_cheng on 2019/4/4.
 */
public class RBTreeNode implements  Comparable<RBTreeNode>{

    private boolean isRed = true;
    private int age;
    private String name;
    private RBTreeNode leftNode;
    private RBTreeNode parentNode;
    private RBTreeNode rightNode;


    public boolean isRed() {
        return isRed;
    }

    public void setRed(boolean red) {
        isRed = red;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RBTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(RBTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public RBTreeNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(RBTreeNode parentNode) {
        this.parentNode = parentNode;
    }

    public RBTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(RBTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "RBTreeNode{" +
                "isRed=" + isRed +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", leftNode=" + leftNode +
                ", parentNode=" + parentNode +
                ", rightNode=" + rightNode +
                '}';
    }


    @Override
    public int compareTo(RBTreeNode node) {
        if(this.age > node.age){
            return 1;
        }else if (this.age == age){
            return 0;
        }else {
            return -1;
        }
    }
}
