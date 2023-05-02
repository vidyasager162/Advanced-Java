public class CustomMap{
	String key;
	Object value;
	CustomMap left;
	CustomMap right;
	
	CustomMap(String key, Object value){
		this.key = key;
		this.value = value;
		this.left = null; 
		this.right = null;
	}
	
	String getKey() {
		return this.key;
	}
	
	Object getValue(){
		return this.value;
	}
 	
	void insert(CustomMap node){
	
		if(this.getKey().compareTo(node.getKey()) > 0) {
			if(this.left == null){
				this.left.insert(node);
			}
		} else if (this.getKey().compareTo(node.getKey()) < 0) {
			this.right.insert(node);
		}
	}
	
	void display() {
		System.out.println(this.left.getKey());
		System.out.println(this.getKey());
		System.out.println(this.right.getKey());
	}
		
	/*Object search(key){
				
	}*/
}

