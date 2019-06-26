package socool.tree;

/**
 * Created by administrator_cheng on 2019/4/1.
 */
public class BinaryTree {
    private TreeNode root;

    public TreeNode insert(String name,int age){
        if (root == null){
            root = new TreeNode(name,age,null,null);
            return root;
        }

        //如果比根节点小则往左边继续查找
        TreeNode node = root;
        return setNode(name, age, node);
    }

    private TreeNode setNode(String name, int age, TreeNode node) {
        if (age < node.getAge()){
            if(node.getLeftTree() == null){
                //如果左子节为空 则新建一个子节点
                node.setLeftTree(new TreeNode(name,age,null,null));
                return  node.getLeftTree();
            }else {
                TreeNode leftNode = node.getLeftTree();
                return setNode(name,age,leftNode);
            }
        }else {
            if(node.getRightTree() == null){
                //如果右子节为空 则新建一个子节点
                node.setRightTree(new TreeNode(name,age,null,null));
                return  node.getRightTree();
            }else {
                TreeNode rightTree = node.getRightTree();
                return setNode(name,age,rightTree);
            }
        }
    }

    public void getAllNode(TreeNode node){
        if (node == null){
            return;
        }
        getAllNode(node.getLeftTree()); ;
        System.out.println(node);
        getAllNode(node.getRightTree());
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
