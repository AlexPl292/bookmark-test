package com.github.alexpl292.bookmarktest

import com.intellij.ide.bookmarks.BookmarkManager
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.vfs.VirtualFile

class MyAction : DumbAwareAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val editor = e.getData(CommonDataKeys.EDITOR)!!
        val virtualFile: VirtualFile = FileDocumentManager.getInstance().getFile(editor.getDocument())!!
        val bookmarkManager = BookmarkManager.getInstance(e.project!!)
        val mark = bookmarkManager.addTextBookmark(virtualFile, 1, "");
        assert(mark.isValid)
    }
}