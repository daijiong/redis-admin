package com.mauersu.util.ztree;

import java.util.Set;
import java.util.TreeSet;

public class ZNode extends ZLeaf{
	
	private boolean open = true;
	
	private Set<ZLeaf> children;
	
	private boolean isParent;
	
	protected ZNode() {
		super();
	}
	
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public Set<ZLeaf> getChildren() {
		if(children==null) {
			children = new TreeSet<ZLeaf>();
		}
		return children;
	}
	public void setChildren(Set<ZLeaf> children) {
		this.children = children;
	}
	public boolean isParent() {
		return isParent;
	}
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	
	//add methods
	public static ZNode makeZNode(String name, Object attach) {
		ZNode node = new ZNode();
		node.name = name;
		node.attach = attach;
		return node;
	}
	
	public void addChildren(ZLeaf zLeaf) {
		if(children==null) {
			children = new TreeSet<ZLeaf>();
		}
		if(zLeaf == null) {
			return ;
		}
		children.add(zLeaf);
	}

	//remove children and set new children
	/*public void resetChildren(ZNode dbIndexZnode) {
		children = new TreeSet<ZLeaf>();
		children.add(dbIndexZnode);
	}*/
	
	public void resetChildren() {
		children = new TreeSet<ZLeaf>();
	}
	
}
