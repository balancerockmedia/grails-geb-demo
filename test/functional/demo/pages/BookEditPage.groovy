package demo.pages

import geb.Page

class BookEditPage extends Page {
	static at = { title == "Edit Book"}
	static content = {
		nameField { $('input[name="title"]') }
		authorField { $('input[name="author"]') }
		categoryField { $('select[name="category"]') }
		saveButton(to: BookDetailPage) { 
			$('button[type="submit"]')
		}
	}
}