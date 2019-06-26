package socool.tree;

import java.util.HashMap;

/**
 * Created by administrator_cheng on 2019/4/4.
 */
public class RBTree {
    private RBTreeNode root;


    private void insert(RBTreeNode n) {
        //若是根节点，则变为黑色
        if (root == null) {
            n.setRed(false);
            root = n;
            return;
        }
        RBTreeNode p = root;
        RBTreeNode current = null;

        //找到节点插入位置
        while (p == null) {
            current = p;
            int cmp = p.compareTo(n);
            if (cmp < 0) {
                p = p.getLeftNode();
            } else {
                p = p.getRightNode();
            }
        }

        n.setParentNode(current);
        int cmp = current.compareTo(n);
        if (cmp < 0) {
            current.setLeftNode(n);
        } else {
            current.setRightNode(n);
        }


        while (n.getParentNode() != null && !n.getParentNode().isRed()) {
            RBTreeNode parent = n.getParentNode();
            //父节点是左节点
            if ((parent == parent.getParentNode().getLeftNode())) {
                RBTreeNode u = parent.getParentNode().getRightNode();
                //若叔父节点为红,则与祖父节点换色
                if (u.isRed()) {
                    boolean parentColor = parent.isRed();
                    parent.setRed(parent.getParentNode().isRed());
                    u.setRed(parent.getParentNode().isRed());
                    parent.getParentNode().setRed(parentColor);
                    n = parent.getParentNode();
                    continue;
                } else {
                    //若叔父节点为黑
                    if (parent.getLeftNode() == n) {

                    }
                }

            }
            if ((parent == parent.getParentNode().getRightNode() && parent.getParentNode().getLeftNode().isRed())) {
                boolean parentColor = parent.isRed();
                parent.setRed(parent.getParentNode().isRed());
                parent.getParentNode().getLeftNode().setRed(parent.getParentNode().isRed());
                parent.getParentNode().setRed(parentColor);
                n = parent.getParentNode();
                continue;
            }

//            //当父节点为红叔父节点为黑，且新增节点为右子节点时
//            if ()
//        }
//
//
//        HashMap

        }
    }
}
