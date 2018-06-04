package edu.ubbcluj.doghome.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Basic(optional = false)  
    @Column(name = "uuid", nullable = false)  
    protected String uuid;  
	
	public BaseEntity(){
	}
	
    public String getuuid(){
    	if (uuid == null ){
    		uuid = UUID.randomUUID().toString();
    	}
    	return uuid;
  
    }
    
    public void setuuid(String uuid){
    	this.uuid = uuid;
    }

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getuuid() == null) ? 0 : getuuid().hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		 if (!getuuid().equals(other.getuuid()))
			return false;
		return true;
	}
	
}
