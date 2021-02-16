## GET/PUT CONTRAVARIANCIA



 📍 Na prática ... 


        List<Object>myObjs = new ArrayList<Object>();
        myObjs.add("Bob");
        myObjs.add("Alex");


        ⚠️ Vamos receber um tipo de lista  que seja supertipo de Number ou propio Number.

        List< ? super Number> list = myObjs;

        .No caso,foi tipo Object(supertipo de Number)

        
         
        
        ❌ GET ERROR !   
        Number x = list.get(2);      

        ⚠️ ERROR,pois o tipo dessa lista pode ser um tipo que seja supertipo de Number.

        

        ✅ PUT OK!
        list.add(10);

       
        
        


        
