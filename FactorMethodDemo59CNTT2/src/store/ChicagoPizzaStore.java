/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import pizza.Pizza;
import pizza.PizzaType;
import pizza.chicago.ChicagoCheeseStyle;
import pizza.chicago.ChicagoClamStyle;
import pizza.chicago.ChicagoPepperoniStyle;


public class ChicagoPizzaStore extends PizzaStore
{
 private static ChicagoPizzaStore store;
    public ChicagoPizzaStore(){}
    public static ChicagoPizzaStore Store() {
        if (store == null) {
            store = new ChicagoPizzaStore();
        }
        return store;
    }
    @Override
    protected Pizza createPizza(PizzaType type)
    {
        switch(type)
        {
            case cheese: return new ChicagoCheeseStyle();
            case clam: return new ChicagoClamStyle();
            case pepperoni: return new ChicagoPepperoniStyle();
        }  
        return null;
    }
    
}