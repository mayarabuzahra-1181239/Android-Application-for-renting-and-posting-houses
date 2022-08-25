// Generated by view binder compiler. Do not edit!
package com.example.renthouse.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.renthouse.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileTenantBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button Edit;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final EditText profileCity;

  @NonNull
  public final EditText profileConfirm;

  @NonNull
  public final Spinner profileCountry;

  @NonNull
  public final EditText profileFamilySize;

  @NonNull
  public final EditText profileFirstName;

  @NonNull
  public final EditText profileGender;

  @NonNull
  public final EditText profileGrossMonthlySalary;

  @NonNull
  public final EditText profileLastName;

  @NonNull
  public final Spinner profileNationality;

  @NonNull
  public final EditText profileOccupation;

  @NonNull
  public final EditText profilePassword;

  @NonNull
  public final EditText profilePhone;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final TextView textView24;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView26;

  @NonNull
  public final TextView textView27;

  @NonNull
  public final TextView textView28;

  private FragmentProfileTenantBinding(@NonNull FrameLayout rootView, @NonNull Button Edit,
      @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2,
      @NonNull EditText profileCity, @NonNull EditText profileConfirm,
      @NonNull Spinner profileCountry, @NonNull EditText profileFamilySize,
      @NonNull EditText profileFirstName, @NonNull EditText profileGender,
      @NonNull EditText profileGrossMonthlySalary, @NonNull EditText profileLastName,
      @NonNull Spinner profileNationality, @NonNull EditText profileOccupation,
      @NonNull EditText profilePassword, @NonNull EditText profilePhone,
      @NonNull TextView textView10, @NonNull TextView textView17, @NonNull TextView textView18,
      @NonNull TextView textView19, @NonNull TextView textView20, @NonNull TextView textView21,
      @NonNull TextView textView22, @NonNull TextView textView23, @NonNull TextView textView24,
      @NonNull TextView textView25, @NonNull TextView textView26, @NonNull TextView textView27,
      @NonNull TextView textView28) {
    this.rootView = rootView;
    this.Edit = Edit;
    this.imageView4 = imageView4;
    this.linearLayout2 = linearLayout2;
    this.profileCity = profileCity;
    this.profileConfirm = profileConfirm;
    this.profileCountry = profileCountry;
    this.profileFamilySize = profileFamilySize;
    this.profileFirstName = profileFirstName;
    this.profileGender = profileGender;
    this.profileGrossMonthlySalary = profileGrossMonthlySalary;
    this.profileLastName = profileLastName;
    this.profileNationality = profileNationality;
    this.profileOccupation = profileOccupation;
    this.profilePassword = profilePassword;
    this.profilePhone = profilePhone;
    this.textView10 = textView10;
    this.textView17 = textView17;
    this.textView18 = textView18;
    this.textView19 = textView19;
    this.textView20 = textView20;
    this.textView21 = textView21;
    this.textView22 = textView22;
    this.textView23 = textView23;
    this.textView24 = textView24;
    this.textView25 = textView25;
    this.textView26 = textView26;
    this.textView27 = textView27;
    this.textView28 = textView28;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileTenantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileTenantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile_tenant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileTenantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Edit;
      Button Edit = ViewBindings.findChildViewById(rootView, id);
      if (Edit == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.profile_city;
      EditText profileCity = ViewBindings.findChildViewById(rootView, id);
      if (profileCity == null) {
        break missingId;
      }

      id = R.id.profile_confirm;
      EditText profileConfirm = ViewBindings.findChildViewById(rootView, id);
      if (profileConfirm == null) {
        break missingId;
      }

      id = R.id.profile_country;
      Spinner profileCountry = ViewBindings.findChildViewById(rootView, id);
      if (profileCountry == null) {
        break missingId;
      }

      id = R.id.profile_familySize;
      EditText profileFamilySize = ViewBindings.findChildViewById(rootView, id);
      if (profileFamilySize == null) {
        break missingId;
      }

      id = R.id.profile_First_name;
      EditText profileFirstName = ViewBindings.findChildViewById(rootView, id);
      if (profileFirstName == null) {
        break missingId;
      }

      id = R.id.profile_gender;
      EditText profileGender = ViewBindings.findChildViewById(rootView, id);
      if (profileGender == null) {
        break missingId;
      }

      id = R.id.profile_GrossMonthlySalary;
      EditText profileGrossMonthlySalary = ViewBindings.findChildViewById(rootView, id);
      if (profileGrossMonthlySalary == null) {
        break missingId;
      }

      id = R.id.profile_Last_name;
      EditText profileLastName = ViewBindings.findChildViewById(rootView, id);
      if (profileLastName == null) {
        break missingId;
      }

      id = R.id.profile_nationality;
      Spinner profileNationality = ViewBindings.findChildViewById(rootView, id);
      if (profileNationality == null) {
        break missingId;
      }

      id = R.id.profile_occupation;
      EditText profileOccupation = ViewBindings.findChildViewById(rootView, id);
      if (profileOccupation == null) {
        break missingId;
      }

      id = R.id.profile_password;
      EditText profilePassword = ViewBindings.findChildViewById(rootView, id);
      if (profilePassword == null) {
        break missingId;
      }

      id = R.id.profile_phone;
      EditText profilePhone = ViewBindings.findChildViewById(rootView, id);
      if (profilePhone == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = ViewBindings.findChildViewById(rootView, id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = ViewBindings.findChildViewById(rootView, id);
      if (textView23 == null) {
        break missingId;
      }

      id = R.id.textView24;
      TextView textView24 = ViewBindings.findChildViewById(rootView, id);
      if (textView24 == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.textView26;
      TextView textView26 = ViewBindings.findChildViewById(rootView, id);
      if (textView26 == null) {
        break missingId;
      }

      id = R.id.textView27;
      TextView textView27 = ViewBindings.findChildViewById(rootView, id);
      if (textView27 == null) {
        break missingId;
      }

      id = R.id.textView28;
      TextView textView28 = ViewBindings.findChildViewById(rootView, id);
      if (textView28 == null) {
        break missingId;
      }

      return new FragmentProfileTenantBinding((FrameLayout) rootView, Edit, imageView4,
          linearLayout2, profileCity, profileConfirm, profileCountry, profileFamilySize,
          profileFirstName, profileGender, profileGrossMonthlySalary, profileLastName,
          profileNationality, profileOccupation, profilePassword, profilePhone, textView10,
          textView17, textView18, textView19, textView20, textView21, textView22, textView23,
          textView24, textView25, textView26, textView27, textView28);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
