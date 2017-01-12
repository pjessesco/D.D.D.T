package com.pjessescogmail.dddt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;

public class MainActivity
  extends AppCompatActivity
  implements SeekBar.OnSeekBarChangeListener
{
  public Button Color;
  public View PopupView;
  public PopupWindow Popupwindow;
  public SeekBar alpha;
  public TextView alphaText;
  public PaintView pv;
  public SeekBar size;
  public TextView sizeText;
  
  public MainActivity() {}
  
  MainActivity(Object[] paramArrayOfObject, InstantReloadException paramInstantReloadException)
  {
    this();
  }
  
  public void buttonTag(View paramView)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null)
    {
      localIncrementalChange.access$dispatch("buttonTag.(Landroid/view/View;)V", new Object[] { this, paramView });
      return;
    }
    Toast.makeText(getApplicationContext(), "asdf " + paramView.getTag(), 1).show();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null)
    {
      localIncrementalChange.access$dispatch("onCreate.(Landroid/os/Bundle;)V", new Object[] { this, paramBundle });
      return;
    }
    super.onCreate(paramBundle);
    this.PopupView = getLayoutInflater().inflate(2130968602, null);
    this.size = ((SeekBar)this.PopupView.findViewById(2131492967));
    this.size.setProgress(30);
    this.alpha = ((SeekBar)this.PopupView.findViewById(2131492969));
    this.alpha.setProgress(100);
    this.Popupwindow = new PopupWindow(this.PopupView, -2, -2);
    this.pv = new PaintView(this, this.size, this.alpha, this.Popupwindow);
    setContentView(this.pv);
    this.sizeText = ((TextView)this.PopupView.findViewById(2131492968));
    this.alphaText = ((TextView)this.PopupView.findViewById(2131492970));
    this.size.setOnSeekBarChangeListener(this);
    this.alpha.setOnSeekBarChangeListener(this);
    this.size.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        IncrementalChange localIncrementalChange = $change;
        if (localIncrementalChange != null)
        {
          localIncrementalChange.access$dispatch("onProgressChanged.(Landroid/widget/SeekBar;IZ)V", new Object[] { this, paramAnonymousSeekBar, new Integer(paramAnonymousInt), new Boolean(paramAnonymousBoolean) });
          return;
        }
        MainActivity.this.sizeText.setText(paramAnonymousInt + "%");
      }
      
      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        IncrementalChange localIncrementalChange = $change;
        if (localIncrementalChange != null) {
          localIncrementalChange.access$dispatch("onStartTrackingTouch.(Landroid/widget/SeekBar;)V", new Object[] { this, paramAnonymousSeekBar });
        }
      }
      
      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        IncrementalChange localIncrementalChange = $change;
        if (localIncrementalChange != null) {
          localIncrementalChange.access$dispatch("onStopTrackingTouch.(Landroid/widget/SeekBar;)V", new Object[] { this, paramAnonymousSeekBar });
        }
      }
    });
    this.alpha.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
    {
      public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        IncrementalChange localIncrementalChange = $change;
        if (localIncrementalChange != null)
        {
          localIncrementalChange.access$dispatch("onProgressChanged.(Landroid/widget/SeekBar;IZ)V", new Object[] { this, paramAnonymousSeekBar, new Integer(paramAnonymousInt), new Boolean(paramAnonymousBoolean) });
          return;
        }
        MainActivity.this.alphaText.setText(paramAnonymousInt + "%");
      }
      
      public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        IncrementalChange localIncrementalChange = $change;
        if (localIncrementalChange != null) {
          localIncrementalChange.access$dispatch("onStartTrackingTouch.(Landroid/widget/SeekBar;)V", new Object[] { this, paramAnonymousSeekBar });
        }
      }
      
      public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar)
      {
        IncrementalChange localIncrementalChange = $change;
        if (localIncrementalChange != null) {
          localIncrementalChange.access$dispatch("onStopTrackingTouch.(Landroid/widget/SeekBar;)V", new Object[] { this, paramAnonymousSeekBar });
        }
      }
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      return ((Boolean)localIncrementalChange.access$dispatch("onCreateOptionsMenu.(Landroid/view/Menu;)Z", new Object[] { this, paramMenu })).booleanValue();
    }
    super.onCreateOptionsMenu(paramMenu);
    getMenuInflater().inflate(2131558400, paramMenu);
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      return ((Boolean)localIncrementalChange.access$dispatch("onOptionsItemSelected.(Landroid/view/MenuItem;)Z", new Object[] { this, paramMenuItem })).booleanValue();
    }
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    case 2131492986: 
      if ((this.Popupwindow != null) && (this.Popupwindow.isShowing()))
      {
        this.Popupwindow.dismiss();
        return true;
      }
      this.Popupwindow.setAnimationStyle(-1);
      this.Popupwindow.showAtLocation(this.PopupView, 48, 0, 170);
      return true;
    case 2131492987: 
      this.pv.undo();
      this.pv.invalidate();
      return true;
    case 2131492988: 
      this.pv.redo();
      this.pv.invalidate();
      return true;
    case 2131492989: 
      this.pv.clear();
      this.pv.invalidate();
      return true;
    }
    Toast.makeText(getApplicationContext(), "Save Coming soon!!", 1).show();
    return true;
  }
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("onProgressChanged.(Landroid/widget/SeekBar;IZ)V", new Object[] { this, paramSeekBar, new Integer(paramInt), new Boolean(paramBoolean) });
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("onStartTrackingTouch.(Landroid/widget/SeekBar;)V", new Object[] { this, paramSeekBar });
    }
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    IncrementalChange localIncrementalChange = $change;
    if (localIncrementalChange != null) {
      localIncrementalChange.access$dispatch("onStopTrackingTouch.(Landroid/widget/SeekBar;)V", new Object[] { this, paramSeekBar });
    }
  }
}
