# F17_lab04

Base repository for CS56 F17 lab04 (Open Source)

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

## Showing the House and Incomplete Snowman

<table>
<tr>
<td style="width:50%">
<p>Try executing the following:</p>

<p><code>ant -DstudentName=pconrad gradePV</code></p>

<p>What you should see will look something like the picture shown at right.</p>
</td>
<td style="width:40%;">
<img alt="Sample output from ant -DstudentName=pconrad gradePV" src="README_images/ant-DstudentName_pconrad_gradePV-30.png">
</td>
</tr>
</table>

This is sample output from the program [src/edu/ucsb/cs56/drawings/pconrad/simple/PictureViewer.java](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/pconrad/simple/PictureViewer.java).

It shows code that was drawn by:
[edu.ucsb.cs56.drawings.pconrad.simple.PictureComponent](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/pconrad/simple/PictureComponent.java).  This code draws a simple house, and an incomplete snowman.

One of your "warmup exercises" for the lab is to try to complete your own version of this snowman (or, if you prefer, "person of snow".)  This requires you to understand the Circle class which is in that same directory, and is just a simple wrapper around the built-in Ellipse2D class provided by that Java libraries.

## Showing examples of three drawings from each of  two  student submissions:

Now try these commands: 


* <code>ant -DstudentName=andrewberls gradeMPV1 </code>
* <code>ant -DstudentName=andrewberls gradeMPV2 </code>
* <code>ant -DstudentName=andrewberls gradeMPV3 </code>
* <code>ant -DstudentName=jstaahl gradeMPV1 </code>
* <code>ant -DstudentName=jstaahl gradeMPV2 </code>
* <code>ant -DstudentName=jstaahl gradeMPV3 </code>

What you should see in the first three cases are three pictures defined by three methods of the class `edu.ucsb.cs56.drawings.andrewberls.advanced.AllMyDrawings`

* [drawPicture1()](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/andrewberls/advanced/AllMyDrawings.java#L31)
* [drawPicture2()](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/andrewberls/advanced/AllMyDrawings.java#L49)
* [drawPicture3()](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/andrewberls/advanced/AllMyDrawings.java#L70)

Here are screenshots of the images that result from running those commands:

<table>
<tr>
<td><img alt="Sample output from ant -DstudentName=andrewberls gradeMPV1" src="README_images/ant-DstudentName_andrewberls_gradeMPV1-30.png"></td>
<td><img alt="Sample output from ant -DstudentName=andrewberls gradeMPV2" src="README_images/ant-DstudentName_andrewberls_gradeMPV2-30.png"></td>
<td><img alt="Sample output from ant -DstudentName=andrewberls gradeMPV3" src="README_images/ant-DstudentName_andrewberls_gradeMPV3-30.png"></td>
</tr>
</table>

All of those are the result of the two iPod images defined in these classes, one of which inherits from the other:

* [`edu.ucsb.cs56.drawings.andrewberls.advanced.IPod`](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/andrewberls/advanced/Ipod.java)
* [`edu.ucsb.cs56.drawings.andrewberls.advanced.IPodDetail`](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/andrewberls/advanced/IpodDetail.java)


Similarly, the second three images are the result of the methods of the class
`edu.ucsb.cs56.drawings.jstaahl.advanced.AllMyDrawings`

* [drawPicture1()](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/jstaahl/advanced/AllMyDrawings.java#L31)
* [drawPicture2()](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/jstaahl/advanced/AllMyDrawings.java#L71)
* [drawPicture3()](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/jstaahl/advanced/AllMyDrawings.java#L121)

All of those are the result of the two pencil images defined in these classes, one of which inherits from the other:

* [`edu.ucsb.cs56.drawings.jstaahl.advanced.Pencil`](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/jstaahl/advanced/Pencil.java)
* [`edu.ucsb.cs56.drawings.jstaahl.advanced.SharpenedPencil`](https://github.com/UCSB-CS56-F17/F17-lab04/blob/master/src/edu/ucsb/cs56/drawings/jstaahl/advanced/SharpenedPencil.java)


Here are screenshots of the images that result from running those commands:

<table>
<tr>
<td><img alt="Sample output from ant -DstudentName=jstaahl gradeMPV1" src="README_images/ant-DstudentName_jstaahl_gradeMPV1-30.png"></td>
<td><img alt="Sample output from ant -DstudentName=jstaahl gradeMPV2" src="README_images/ant-DstudentName_jstaahl_gradeMPV2-30.png"></td>
<td><img alt="Sample output from ant -DstudentName=jstaahl gradeMPV3" src="README_images/ant-DstudentName_jstaahl_gradeMPV3-30.png"></td>
</tr>
</table>

