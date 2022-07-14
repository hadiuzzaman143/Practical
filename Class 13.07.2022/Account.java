class Account 
{ 
    private long acc_no; 
    private String name,email; 
    private float amount; 
    //public getter and setter methods 
    public long getAcc_no() 
    { 
        return acc_no; 
    } 
    public void setAcc_no(long acc_no) 
    { 
        this.acc_no = acc_no; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public void setName(String name) 
    { 
        this.name = name; 
    } 
    public String getEmail() 
    { 
        return email; 
    } 
    public void setEmail(String email) 
    { 
        this.email = email; 
    } 
    public float getAmount() 
    { 
        return amount; 
    } 
    public void setAmount(float amount) 
    { 
        this.amount = amount; 
    } 
       
    } 
    class Account2
    { 
    public static void main(String[] args) 
    { 
         
        Account acc=new Account(); 
        
        acc.setAcc_no(7310805450L); 
        acc.setName("Hadiuz"); 
        acc.setEmail("Hadiuz@gmail.com"); 
        acc.setAmount(100000); 
         
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount()); 
    } 
    }
