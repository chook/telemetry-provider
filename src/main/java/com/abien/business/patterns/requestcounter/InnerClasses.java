package com.abien.business.patterns.requestcounter;

public class InnerClasses {
  class Inner1
  {
    private int x = 5;
  };

  public void do1() {
    int x = 1 + new Inner1().x;
    System.out.println("x is " + x);

    Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					new Inner1();
				}
				catch (Throwable e)
				{
					
				}
			}
		};
  }
}
