package com.simplilearn.serialization.Items;
import java.io.Serializable;

public class Items implements Serializable {

	public int id;
	public String name;
	public Items() {}
	
	public Items(int id, String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
}
