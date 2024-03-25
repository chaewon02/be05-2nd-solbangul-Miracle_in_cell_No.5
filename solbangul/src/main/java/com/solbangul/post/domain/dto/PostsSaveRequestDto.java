package com.solbangul.post.domain.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import com.solbangul.post.domain.Category;
import com.solbangul.post.domain.Post;
import com.solbangul.room.domain.Room;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {
	private Long id;

	private Long roomId;

	private String title;

	private Boolean publicYn;

	private Boolean annonyYn;

	private String content;

	private String writer;

	private Boolean deleteYn;

	@Enumerated(EnumType.STRING)
	private Category category;

	private Boolean readYn;

	public Post toEntity(Room room) {
		return Post.builder()
			.room(room)
			.title(title)
			.publicYn(publicYn)
			.annonyYn(annonyYn)
			.content(content)
			.writer(writer)
			.deleteYn(deleteYn)
			.category(category)
			.readYn(readYn)
			.build();
	}
}
