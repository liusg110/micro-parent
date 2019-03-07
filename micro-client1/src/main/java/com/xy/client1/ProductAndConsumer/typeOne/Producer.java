package com.xy.client1.ProductAndConsumer.typeOne;

/**
 * 生产者
 */
public class Producer implements Runnable {

    private PublicObect obect;

    public Producer(PublicObect obect) {
        this .obect = obect;
    }

    @Override
    public void run() {

        for( int i=0;i<10;i++)
        {
            try {
                System. out .println("pro  i:" +i);
                Thread. sleep(30);
            } catch (InterruptedException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            obect.product();
        }

    }
}