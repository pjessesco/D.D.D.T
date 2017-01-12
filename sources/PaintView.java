package com.pjessescogmail.dddt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;
import java.util.ArrayList;

public class PaintView
  extends View
{
  public static ArrayList<Point> course;
  public static ArrayList<Point> temp;
  public int alpha;
  public Canvas canvas;
  public float new_x;
  public float new_y;
  public float old_x;
  public float old_y;
  public Paint paint;
  public int size;
  
  public PaintView(Context paramContext, AttributeSet paramAttributeSet) {}
  
  public PaintView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {}
  
  public PaintView(Context paramContext, SeekBar paramSeekBar1, SeekBar paramSeekBar2, PopupWindow paramPopupWindow) {}
  
  PaintView(Object[] paramArrayOfObject, InstantReloadException paramInstantReloadException)
  {
    this((Context)paramArrayOfObject[1], (SeekBar)paramArrayOfObject[2], (SeekBar)paramArrayOfObject[3], (PopupWindow)paramArrayOfObject[4]);
  }
  
  public void clear()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null)
    {
      localIncrementalChange.access$dispatch("clear.()V", new Object[] { this });
      return;
    }
    closeWindow();
    clearCourse();
    clearTemp();
  }
  
  public void clearCourse()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("clearCourse.()V", new Object[] { this });
    }
    for (;;)
    {
      return;
      int i = course.size() - 1;
      while (i >= 0)
      {
        course.remove(i);
        i -= 1;
      }
    }
  }
  
  public void clearTemp()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("clearTemp.()V", new Object[] { this });
    }
    for (;;)
    {
      return;
      int i = temp.size() - 1;
      while (i >= 0)
      {
        temp.remove(i);
        i -= 1;
      }
    }
  }
  
  public void closeWindow()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("closeWindow.()V", new Object[] { this });
    }
    while ((this.brushWindow == null) || (!this.brushWindow.isShowing())) {
      return;
    }
    this.brushWindow.dismiss();
  }
  
  public void color()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("color.()V", new Object[] { this });
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null)
    {
      localIncrementalChange.access$dispatch("onDraw.(Landroid/graphics/Canvas;)V", new Object[] { this, paramCanvas });
      return;
    }
    super.onDraw(paramCanvas);
    int i = 1;
    label38:
    if (i < course.size())
    {
      this.old_x = ((Point)course.get(i - 1)).x;
      this.old_y = ((Point)course.get(i - 1)).y;
      this.new_x = ((Point)course.get(i)).x;
      this.new_y = ((Point)course.get(i)).y;
      this.paint.setStrokeWidth((float)(((Point)course.get(i)).size * 0.18D));
      this.paint.setAlpha(((Point)course.get(i)).alpha * 2 + 15);
      if (((Point)course.get(i)).bool) {
        break label214;
      }
      paramCanvas.drawPoint(this.new_x, this.new_y, this.paint);
    }
    for (;;)
    {
      i += 1;
      break label38;
      break;
      label214:
      paramCanvas.drawLine(this.old_x, this.old_y, this.new_x, this.new_y, this.paint);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      return ((Boolean)localIncrementalChange.access$dispatch("onTouchEvent.(Landroid/view/MotionEvent;)Z", new Object[] { this, paramMotionEvent })).booleanValue();
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      invalidate();
      return true;
      if (temp.size() != 0) {
        clearTemp();
      }
      closeWindow();
      this.size = this.sizeBar.getProgress();
      this.alpha = this.alphaBar.getProgress();
      course.add(new Point((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY(), false, this.size, this.alpha));
      continue;
      this.size = this.sizeBar.getProgress();
      this.alpha = this.alphaBar.getProgress();
      course.add(new Point((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY(), true, this.size, this.alpha));
    }
  }
  
  public void redo()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("redo.()V", new Object[] { this });
    }
    for (;;)
    {
      return;
      closeWindow();
      int j = temp.size() - 1;
      int i = j;
      if (j != -1)
      {
        course.add(temp.get(j));
        temp.remove(j);
        i = j - 1;
      }
      if (temp.size() != 0) {
        while ((((Point)temp.get(i)).bool == true) && (i > 0))
        {
          course.add(temp.get(i));
          temp.remove(i);
          i -= 1;
        }
      }
    }
  }
  
  public void save()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("save.()V", new Object[] { this });
    }
  }
  
  public void size()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("size.()V", new Object[] { this });
    }
  }
  
  public void undo()
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("undo.()V", new Object[] { this });
    }
    int i;
    do
    {
      return;
      closeWindow();
      i = course.size() - 1;
    } while (course.size() == 0);
    while (((Point)course.get(i)).bool == true)
    {
      temp.add(course.get(i));
      course.remove(i);
      i -= 1;
    }
    temp.add(course.get(course.size() - 1));
    course.remove(course.size() - 1);
  }
}
