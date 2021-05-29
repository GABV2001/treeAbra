package edu.ni.abra.intent

sealed class Intent {
    object GetTreeEvent:Intent()
    object None:Intent()
}