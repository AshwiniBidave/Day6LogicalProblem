package com.Day6;

import java.util.Scanner;

import javax.swing.text.Utilities;

public class StopwathProgram  {
public long startTimer=0;
public long stopTimer=0;
public long elapsed;


	public static void main(String[] args) throws InterruptedException {
		StopwathProgram stopwatch = new StopwathProgram();
	    stopwatch.Start();
	    
	    for (int i = 0; i < 1000; i++)
        {
            Thread.sleep(1);
        }
		stopwatch.Stop();
		long elapsed =stopwatch.getElapsedTime();
        System.out.println("Total Time Elapsed(in millisec) is:"+elapsed);

       

       

	}

	private void Stop() {
		long stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
		
	}

	private void Start() {
		long startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
		
	}

	public long getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		return elapsed;
	}
	

}
