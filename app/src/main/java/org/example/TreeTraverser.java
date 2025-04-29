package org.example;

public class TreeTraverser
{
    public void printTree(TreeNode node)
    {
        if (node.left() != null)
        {
            printTree(node.left());

        }

        System.out.println(node.get_squirrel().getName());

        if (node.right() != null)
        {
            printTree(node.right());

        }

    }
}