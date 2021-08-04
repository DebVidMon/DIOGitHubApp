package com.example.meugithub.domain

import com.example.meugithub.core.UseCase
import com.example.meugithub.data.model.Repo
import com.example.meugithub.data.repository.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}