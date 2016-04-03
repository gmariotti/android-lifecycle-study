package com.mariotti.developer.studyapplicationlifecycle

import android.support.v4.app.Fragment

class OnActivityResultActivity : SingleFragmentActivity() {

    override val TAG: String = "OnActivityResultActivity"

    override fun createFragment(): Fragment = OnActivityResultFragment()

}