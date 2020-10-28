/**
 */
package org.eclipse.sirius.sample.website.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.sample.website.Button;
import org.eclipse.sirius.sample.website.Image;
import org.eclipse.sirius.sample.website.Link;
import org.eclipse.sirius.sample.website.Paragraph;
import org.eclipse.sirius.sample.website.Section;
import org.eclipse.sirius.sample.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.SectionImpl#getSubParagraphs <em>Sub Paragraphs</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.SectionImpl#getSubImages <em>Sub Images</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.SectionImpl#getSubLinks <em>Sub Links</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.SectionImpl#getSubButtons <em>Sub Buttons</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.SectionImpl#getChildSections <em>Child Sections</em>}</li>
 *   <li>{@link org.eclipse.sirius.sample.website.impl.SectionImpl#getParentSections <em>Parent Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends ContentImpl implements Section {
	/**
	 * The cached value of the '{@link #getSubParagraphs() <em>Sub Paragraphs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> subParagraphs;

	/**
	 * The cached value of the '{@link #getSubImages() <em>Sub Images</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> subImages;

	/**
	 * The cached value of the '{@link #getSubLinks() <em>Sub Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> subLinks;

	/**
	 * The cached value of the '{@link #getSubButtons() <em>Sub Buttons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> subButtons;

	/**
	 * The cached value of the '{@link #getChildSections() <em>Child Sections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> childSections;

	/**
	 * The cached value of the '{@link #getParentSections() <em>Parent Sections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> parentSections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getSubParagraphs() {
		if (subParagraphs == null) {
			subParagraphs = new EObjectResolvingEList<Paragraph>(Paragraph.class, this,
					WebsitePackage.SECTION__SUB_PARAGRAPHS);
		}
		return subParagraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getSubImages() {
		if (subImages == null) {
			subImages = new EObjectResolvingEList<Image>(Image.class, this, WebsitePackage.SECTION__SUB_IMAGES);
		}
		return subImages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getSubLinks() {
		if (subLinks == null) {
			subLinks = new EObjectResolvingEList<Link>(Link.class, this, WebsitePackage.SECTION__SUB_LINKS);
		}
		return subLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getSubButtons() {
		if (subButtons == null) {
			subButtons = new EObjectResolvingEList<Button>(Button.class, this, WebsitePackage.SECTION__SUB_BUTTONS);
		}
		return subButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getChildSections() {
		if (childSections == null) {
			childSections = new EObjectWithInverseResolvingEList.ManyInverse<Section>(Section.class, this,
					WebsitePackage.SECTION__CHILD_SECTIONS, WebsitePackage.SECTION__PARENT_SECTIONS);
		}
		return childSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getParentSections() {
		if (parentSections == null) {
			parentSections = new EObjectWithInverseResolvingEList.ManyInverse<Section>(Section.class, this,
					WebsitePackage.SECTION__PARENT_SECTIONS, WebsitePackage.SECTION__CHILD_SECTIONS);
		}
		return parentSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebsitePackage.SECTION__CHILD_SECTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildSections()).basicAdd(otherEnd, msgs);
		case WebsitePackage.SECTION__PARENT_SECTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParentSections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebsitePackage.SECTION__CHILD_SECTIONS:
			return ((InternalEList<?>) getChildSections()).basicRemove(otherEnd, msgs);
		case WebsitePackage.SECTION__PARENT_SECTIONS:
			return ((InternalEList<?>) getParentSections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebsitePackage.SECTION__SUB_PARAGRAPHS:
			return getSubParagraphs();
		case WebsitePackage.SECTION__SUB_IMAGES:
			return getSubImages();
		case WebsitePackage.SECTION__SUB_LINKS:
			return getSubLinks();
		case WebsitePackage.SECTION__SUB_BUTTONS:
			return getSubButtons();
		case WebsitePackage.SECTION__CHILD_SECTIONS:
			return getChildSections();
		case WebsitePackage.SECTION__PARENT_SECTIONS:
			return getParentSections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WebsitePackage.SECTION__SUB_PARAGRAPHS:
			getSubParagraphs().clear();
			getSubParagraphs().addAll((Collection<? extends Paragraph>) newValue);
			return;
		case WebsitePackage.SECTION__SUB_IMAGES:
			getSubImages().clear();
			getSubImages().addAll((Collection<? extends Image>) newValue);
			return;
		case WebsitePackage.SECTION__SUB_LINKS:
			getSubLinks().clear();
			getSubLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case WebsitePackage.SECTION__SUB_BUTTONS:
			getSubButtons().clear();
			getSubButtons().addAll((Collection<? extends Button>) newValue);
			return;
		case WebsitePackage.SECTION__CHILD_SECTIONS:
			getChildSections().clear();
			getChildSections().addAll((Collection<? extends Section>) newValue);
			return;
		case WebsitePackage.SECTION__PARENT_SECTIONS:
			getParentSections().clear();
			getParentSections().addAll((Collection<? extends Section>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WebsitePackage.SECTION__SUB_PARAGRAPHS:
			getSubParagraphs().clear();
			return;
		case WebsitePackage.SECTION__SUB_IMAGES:
			getSubImages().clear();
			return;
		case WebsitePackage.SECTION__SUB_LINKS:
			getSubLinks().clear();
			return;
		case WebsitePackage.SECTION__SUB_BUTTONS:
			getSubButtons().clear();
			return;
		case WebsitePackage.SECTION__CHILD_SECTIONS:
			getChildSections().clear();
			return;
		case WebsitePackage.SECTION__PARENT_SECTIONS:
			getParentSections().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WebsitePackage.SECTION__SUB_PARAGRAPHS:
			return subParagraphs != null && !subParagraphs.isEmpty();
		case WebsitePackage.SECTION__SUB_IMAGES:
			return subImages != null && !subImages.isEmpty();
		case WebsitePackage.SECTION__SUB_LINKS:
			return subLinks != null && !subLinks.isEmpty();
		case WebsitePackage.SECTION__SUB_BUTTONS:
			return subButtons != null && !subButtons.isEmpty();
		case WebsitePackage.SECTION__CHILD_SECTIONS:
			return childSections != null && !childSections.isEmpty();
		case WebsitePackage.SECTION__PARENT_SECTIONS:
			return parentSections != null && !parentSections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionImpl
