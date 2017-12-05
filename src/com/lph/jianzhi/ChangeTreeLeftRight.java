package com.lph.jianzhi;

/**
 * 交换二叉树左右子树
 */
public class ChangeTreeLeftRight {
	void Change(BinaryNode<T> p){
		if(p!=null){
			if(p.left!=null && p.right!=null){
				BinaryNode<T> tmp=p.right;
				p.right=p.left;
				p.left=tmp;
			}
			if(p.left!=null){
				Change(p.left);
			}
			if(p.right!=null){
				Change(p.right);
			}
		}
	}
}
