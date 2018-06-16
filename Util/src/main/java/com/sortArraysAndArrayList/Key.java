package com.sortArraysAndArrayList;

public class Key {
	
	private String fname;
    private String lname;
    
    public Key(String fname, String lname)
    {
    	super();
    	this.fname = fname;
    	this.lname = lname;
    }
    
    @Override
	  public int hashCode() {
	    int hash = 3;
	    hash = 7 * hash + this.fname.hashCode();
	    hash = 7 * hash + this.lname.hashCode();
	    return hash;
	  }
    
    @Override
	public boolean equals(Object obj)
	{
		if(obj == null || getClass() != obj.getClass())
		return false;
		
		else
		{
		Key k = (Key) obj;
	      if (this.fname == k.getFname()
	          && this.lname == k.getLname()) {
	        return true;
	      }
		}
		return false;		
	}
    
    @Override
	public String toString() {
		return this.fname + "  :  " + this.lname;

	}
    
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
    
    

}
