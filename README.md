# F16_lab04

Base repository for CS56 F16 lab04 (Open Source)

# Student Instructions

See: https://ucsb-cs56-f16.github.io/lab/lab04/

# How to run this code (originally: grader hints)

Originally, this section of the README.md was called *grader hints*, but is occurred to me that
students completing the assignment should probably read this also.    These are the commands
that the TA, Reader, Instructor are going to use to check your work, so it will benefit you to
run these commands also.

In addition, you can see examples of some past student work that illustrates what you are supposed 
to do in this assignment.

# Overview

* Use <code>ant -p</code> to see all available tasks
* The grader tasks include these:

<pre>
 gradeMPV1          run MultiPictureViewer for studentName with arg 1
 gradeMPV2          run MultiPictureViewer for studentName with arg 2
 gradeMPV3          run MultiPictureViewer for studentName with arg 3
 gradePV            run simple.PictureViewer for student in studentName property
 gradeSimpleGui1    run simpleGui1 for student in studentName property
</pre>

To run one of those tasks, overriding the student's CSIL id to jgaucho, use, for example:

<code>ant -DstudentName=jgaucho gradePV</code>

You can test this with studentName set to <code>pconrad</code>, <code>andrewberls</code>, or <code>jstaahl</code> as examples.   All of those should work on pconrad, though only the MPV tasks will work for the other two.

# Detail

Try executing the following:

<code>ant -DstudentName=pconrad gradePV</code>

What you should see will look something like this:

![Sample output from ant -DstudentName=pconrad gradePV](README_drawings/ant-DstudentName_pconrad_gradePV.png)

This is sample output from the program [src/edu/ucsb/cs56/drawings/pconrad/simple/PictureViewer.java](https://github.com/UCSB-CS56-F16/F16-lab04/blob/master/src/edu/ucsb/cs56/drawings/pconrad/simple/PictureViewer.java).

It shows code that was drawn by [F16-lab04/src/edu/ucsb/cs56/drawings/pconrad/simple/PictureComponent.java](https://github.com/UCSB-CS56-F16/F16-lab04/blob/master/src/edu/ucsb/cs56/drawings/pconrad/simple/PictureComponent.java), which draws a simple House, and an incomplete snowman.

One of your "warmup exercises" is to try to complete your own version of this snowman (or, if you prefer, "person of snow".)





