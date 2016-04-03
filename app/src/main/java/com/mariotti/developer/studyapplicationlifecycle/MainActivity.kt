package com.mariotti.developer.studyapplicationlifecycle

import android.support.v4.app.Fragment

class MainActivity : SingleFragmentActivity() {

	override val TAG = "MainActivity"

	override fun createFragment(): Fragment = MainFragment()

}
