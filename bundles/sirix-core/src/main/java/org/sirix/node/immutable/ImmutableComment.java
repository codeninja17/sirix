package org.sirix.node.immutable;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.sirix.api.visitor.VisitResult;
import org.sirix.api.visitor.Visitor;
import org.sirix.node.CommentNode;
import org.sirix.node.Kind;
import org.sirix.node.SirixDeweyID;
import org.sirix.node.interfaces.Node;
import org.sirix.node.interfaces.immutable.ImmutableStructNode;
import org.sirix.node.interfaces.immutable.ImmutableValueNode;

import com.google.common.base.Optional;

/**
 * Immutable comment node wrapper.
 * 
 * @author Johannes Lichtenberger
 * 
 */
public class ImmutableComment implements ImmutableValueNode, ImmutableStructNode {

	/** Mutable {@link CommentNode}. */
	private final CommentNode mNode;

	/**
	 * Constructor.
	 * 
	 * @param node
	 *          mutable {@link CommentNode}
	 */
	private ImmutableComment(final @Nonnull CommentNode node) {
		mNode = checkNotNull(node);
	}

	/**
	 * Get an immutable comment node instance.
	 * 
	 * @param node
	 *          the mutable {@link CommentNode} to wrap
	 * @return immutable comment node instance
	 */
	public static ImmutableComment of(final @Nonnull CommentNode node) {
		return new ImmutableComment(node);
	}

	@Override
	public int getTypeKey() {
		return mNode.getTypeKey();
	}

	@Override
	public boolean isSameItem(final @Nullable Node other) {
		return mNode.isSameItem(other);
	}

	@Override
	public VisitResult acceptVisitor(final @Nonnull Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public long getHash() {
		return mNode.getHash();
	}

	@Override
	public long getParentKey() {
		return mNode.getParentKey();
	}

	@Override
	public boolean hasParent() {
		return mNode.hasParent();
	}

	@Override
	public long getNodeKey() {
		return mNode.getNodeKey();
	}

	@Override
	public Kind getKind() {
		return mNode.getKind();
	}

	@Override
	public long getRevision() {
		return mNode.getRevision();
	}

	@Override
	public byte[] getRawValue() {
		return mNode.getRawValue();
	}

	@Override
	public boolean hasFirstChild() {
		return mNode.hasFirstChild();
	}

	@Override
	public boolean hasLeftSibling() {
		return mNode.hasLeftSibling();
	}

	@Override
	public boolean hasRightSibling() {
		return mNode.hasRightSibling();
	}

	@Override
	public long getChildCount() {
		return mNode.getChildCount();
	}

	@Override
	public long getDescendantCount() {
		return mNode.getDescendantCount();
	}

	@Override
	public long getFirstChildKey() {
		return mNode.getFirstChildKey();
	}

	@Override
	public long getLeftSiblingKey() {
		return mNode.getLeftSiblingKey();
	}

	@Override
	public long getRightSiblingKey() {
		return mNode.getRightSiblingKey();
	}
	
	@Override
	public Optional<SirixDeweyID> getDeweyID() {
		return mNode.getDeweyID();
	}
}