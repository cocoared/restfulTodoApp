package com.example.demo.entity;




import lombok.Data;

@Data
public class TodoWithoutId {
	private String title;

	enum Status {
		INCOMPLETE("未完了"), INPROGRESS("進行中"), COMPLETED("完了")

		//定数の後ろにフィールドを定義する場合、定数とフィールドの間にコロンが必要
		;

		/** Enumの和名 */
		private final String statusName;

		/**
		 * コンストラクタ
		 * @param statusName
		 */
		private Status(String statusName) {
			this.statusName = statusName;
		}

		public String getStatusName() {
			return this.statusName;
		}

	}

	private String details;
}
