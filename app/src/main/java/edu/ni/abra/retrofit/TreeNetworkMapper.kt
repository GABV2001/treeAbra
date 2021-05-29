package edu.ni.abra.retrofit

import edu.ni.abra.model.Tree
import edu.ni.abra.util.EntityMapper
import javax.inject.Inject

class TreeNetworkMapper
@Inject
constructor():EntityMapper<TreeNetworkEntity, Tree>{
    override fun mapFromEntity(entity: TreeNetworkEntity): Tree {
        return Tree(
            key = entity.key,
            name = entity.name,
            scientificName = entity.scientificName,
            description = entity.description,
            picture = entity.picture
        )
    }

    override fun mapToEntity(domainModel: Tree): TreeNetworkEntity {
        return TreeNetworkEntity(
            key = domainModel.key,
            name = domainModel.name,
            scientificName = domainModel.scientificName,
            description = domainModel.description,
            picture = domainModel.picture
        )
    }

    fun mapFromListEntities(entities:List<TreeNetworkEntity>): List<Tree> {
        return  entities.map { mapFromEntity(it) }
    }
}