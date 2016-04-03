package com.mariotti.developer.studyapplicationlifecycle

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class OnActivityResultFragment : LoggedFragment() {

    override val TAG: String = "OnActivityResultFragment"
    override val layoutID: Int = R.layout.fragment_on_activity_result

    lateinit var finishButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(layoutID, container, false)

        Log.d(TAG, "onCreateView")

        finishButton = view.findViewById(R.id.finish_button) as Button
        finishButton.setOnClickListener {
            Log.d(TAG, "finish()")
            activity.finish()
        }

        return view
    }
}