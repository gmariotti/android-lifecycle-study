package com.mariotti.developer.studyapplicationlifecycle

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MainFragment : LoggedFragment() {

	override val TAG: String = "MainFragment"

	val REQUEST_CODE = 1
	lateinit var onActivityResultButton: Button

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
		val view = inflater.inflate(layoutID, container, false)

		Log.d(TAG, "onCreateView")

		onActivityResultButton = view.findViewById(R.id.on_activity_result_button) as Button
		onActivityResultButton.setOnClickListener {
			val intent = Intent(activity, OnActivityResultActivity::class.java)
			startActivityForResult(intent, REQUEST_CODE)
		}

		return view
	}

	override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
		Log.d(TAG, "onActivityResult")

		if (resultCode != Activity.RESULT_OK) return

		if (requestCode == REQUEST_CODE) {
			return
		}
	}
}