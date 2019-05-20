public class Damenproblem
{
    int d1;
    int d2;
    int d3;
    int d4;
    int d5;
    int d6;
    int d7;
    int d8;
    int a;
    int i;
    
    
    public Damenproblem()
    {
    }


    public void dame1()
    {
        d1 = 3;
    }
    
    public void dame1neu()
    {
        d1 = d1+1;
    }
    
    public void dame2()
    {        
        for(i=9;i<17;i++)
        {
            a = i;
            if (prufungd2())
            { 
                d2 = a;
                return;
            }
            
        }
        
        
    }
    
    public void dame2neu()
    {
        for(i=d2+1;i<17;i++)
        {
            if (prufungd2())
            { 
                d2 = a;
                return;
            }
        
         }
         dame1neu();
         
   }
   
   
    
    public void dame3()
    {        
        for(i=17;i<25;i++)
        {
            a = i;
            if (prufungd3())
            { 
                d3 = a;
                return;
            }
            
        }
        dame2neu();
    }
    public void dame3neu()
    {
        for(i=d3+1;i<25;i++)
        {
            if (prufungd3())
            { 
                d3 = a;
                return;
            }
        
         }
   }

   public void dame4()
    {        
        for(i=25;i<33;i++)
        {
            a = i;
            if (prufungd4())
            { 
                d4 = a;
                return;
            }
            
        }
        dame3neu();
    }
    public void dame4neu()
    {
        for(i=d4+1;i<33;i++)
        {
            if (prufungd4())
            { 
                d4 = a;
                return;
            }
        
         }
   }
   
   public void dame5()
    {        
        for(i=33;i<41;i++)
        {
            a = i;
            if (prufungd5())
            { 
                d5 = a;
                return;
            }
            
        }
        dame4neu();
    }
    public void dame5neu()
    {
        for(i=d5+1;i<41;i++)
        {
            if (prufungd5())
            { 
                d5 = a;
                return;
            }
        
         }
   }
   
   
   
   
        
        
    public boolean prufungd2()
    {
        if (a == d1+8)
        { return false; }
        
        if (d1+9<17)
        {
            if (a == d1+9)
            { return false; }
        }
        
        if (d1+7>8)
        {
            if (a == d1+7)
            { return false; }
        }
        return true;
    }
    
    public boolean prufungd3()
      {
              
        
        
        if (a == d1+16)
        { return false; }
        
        if (d1+17>25)
        {
            if (a == d1+17)
            { return false; }
        }
        
        if (d1+15<16)
        {
            if (a == d1+15)
            { return false; }
        }
        
        
        
        if (a == d2+8)
        { return false; }
        
        if (d2+9<17)
        {
            if (a == d2+9)
            { return false; }
        }
        
        if (d2+7>8)
        {
            if (a == d2+7)
            { return false; }
        }
        return true;

    }
    
        


    
public boolean prufungd4()
    {
        
        if (a == d1+24)
        { return false; }
        
        if (d1+25>33)
        {
            if (a == d1+25)
            { return false; }
        }
        
        if (d1+23<24)
        {
            if (a == d1+23)
            { return false; }
        }        
        
        
        
        
        if (a == d2+16)
        { return false; }
        
        if (d2+17>25)
        {
            if (a == d2+17)
            { return false; }
        }
        
        if (d2+15<16)
        {
            if (a == d2+15)
            { return false; }
        }
        
        
        
        if (a == d3+8)
        { return false; }
        
        if (d3+9<17)
        {
            if (a == d3+9)
            { return false; }
        }
        
        if (d3+7>8)
        {
            if (a == d3+7)
            { return false; }
        }
        return true;

    }
    
    
    
    
    
    public boolean prufungd5()
    {
        
        if (a == d1+24)
        { return false; }
        
        if (d1+25>33)
        {
            if (a == d1+25)
            { return false; }
        }
        
        if (d1+23<24)
        {
            if (a == d1+23)
            { return false; }
        }        
        
        
        
        
        if (a == d2+16)
        { return false; }
        
        if (d2+17>25)
        {
            if (a == d2+17)
            { return false; }
        }
        
        if (d2+15<16)
        {
            if (a == d2+15)
            { return false; }
        }
        
        
        
        if (a == d3+8)
        { return false; }
        
        if (d3+9<17)
        {
            if (a == d3+9)
            { return false; }
        }
        
        if (d3+7>8)
        {
            if (a == d3+7)
            { return false; }
        }
        return true;

    }
    
    
    
    
    public void ausgabe()
    {
        System.out.print(d1 + "|" + d2 + "|" + d3 + "|" + d4);
    }
        
    }
    
        

