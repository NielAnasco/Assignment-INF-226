public class Weapon {
    int damage;
    String name;
    String rarity;
    String Weapon;
   

    public void Name() {
        System.out.println("Your Weapon is " + name);
    }
    
    public void Damage() {
        System.out.println("Your Weapon Damage is " + damage);
    }

    public void Rarity() {
        System.out.println("Your Weapon Rarity is " + rarity); 
    }
    
    public void addDamage (int additionalDamage) {
        
        int newDamage = this.damage + additionalDamage;
        System.out.println("Damage has been increased from " + damage + " to " + newDamage);
      
        this.damage = newDamage;
    }  
        String showNameRarity() {
            return this.name + " " + this.rarity;
        }
}