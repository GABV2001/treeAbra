package edu.ni.abra.util

import edu.ni.abra.model.Tree
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class Success(val trees:List<Tree>):DataState()
    data class Error(val exception: Exception):DataState()
    object Loading:DataState()
}